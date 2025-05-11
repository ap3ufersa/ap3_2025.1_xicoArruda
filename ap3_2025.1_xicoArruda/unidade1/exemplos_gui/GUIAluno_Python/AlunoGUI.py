import tkinter as tk
from tkinter import messagebox, ttk
from datetime import datetime

class Aluno:
    def __init__(self, matricula=-1, nome_completo="", nome_da_mae="", data_nascimento=None, data_cadastro=None):
        self.matricula = matricula
        self.nome_completo = nome_completo
        self.nome_da_mae = nome_da_mae
        self.data_nascimento = data_nascimento
        self.data_cadastro = data_cadastro or datetime.now()

    def __str__(self):
        return f"Aluno [matricula={self.matricula}, nome_completo={self.nome_completo}, nome_da_mae={self.nome_da_mae}, data_nascimento={self.data_nascimento}, data_cadastro={self.data_cadastro}]"


class MainAlunoTkinter:
    def __init__(self, root):
        self.root = root
        self.root.title("Cadastro de Alunos")
        self.alunos = []
        self.exibicao_alunos_gui = None
        self.create_widgets()

    def create_widgets(self):
        self.btn_cadastrar_aluno = tk.Button(self.root, text="Cadastrar Aluno", command=self.cadastrar_aluno)
        self.btn_cadastrar_aluno.pack(pady=10)

        self.btn_exibir_alunos = tk.Button(self.root, text="Exibir Alunos", command=self.exibir_alunos)
        self.btn_exibir_alunos.pack(pady=10)

    def cadastrar_aluno(self):
        CadastraAlunoTkinter(self.root, self.alunos, self.exibicao_alunos_gui)

    def exibir_alunos(self):
        self.exibicao_alunos_gui = ExibeAlunosTkinter(self.root, self.alunos)


class CadastraAlunoTkinter:
    def __init__(self, root, alunos, exibicao_alunos_gui):
        self.root = root
        self.alunos = alunos
        self.exibicao_alunos_gui = exibicao_alunos_gui
        self.create_widgets()

    def create_widgets(self):
        self.window = tk.Toplevel(self.root)
        self.window.title("Cadastro de Aluno")

        self.lbl_nome_completo = tk.Label(self.window, text="Nome Completo:")
        self.lbl_nome_completo.grid(row=0, column=0)
        self.ent_nome_completo = tk.Entry(self.window)
        self.ent_nome_completo.grid(row=0, column=1)

        self.lbl_nome_da_mae = tk.Label(self.window, text="Nome da Mãe:")
        self.lbl_nome_da_mae.grid(row=1, column=0)
        self.ent_nome_da_mae = tk.Entry(self.window)
        self.ent_nome_da_mae.grid(row=1, column=1)

        self.lbl_matricula = tk.Label(self.window, text="Matrícula:")
        self.lbl_matricula.grid(row=2, column=0)
        self.ent_matricula = tk.Entry(self.window)
        self.ent_matricula.grid(row=2, column=1)

        self.lbl_data_nascimento = tk.Label(self.window, text="Data de Nascimento (dd/MM/yyyy):")
        self.lbl_data_nascimento.grid(row=3, column=0)
        self.ent_data_nascimento = tk.Entry(self.window)
        self.ent_data_nascimento.grid(row=3, column=1)

        self.btn_cadastrar = tk.Button(self.window, text="Cadastrar Aluno", command=self.cadastrar_aluno)
        self.btn_cadastrar.grid(row=4, columnspan=2, pady=10)

    def cadastrar_aluno(self):
        try:
            nome_completo = self.ent_nome_completo.get()
            nome_da_mae = self.ent_nome_da_mae.get()
            matricula = int(self.ent_matricula.get())
            data_nascimento_str = self.ent_data_nascimento.get()
            data_nascimento = datetime.strptime(data_nascimento_str, "%d/%m/%Y")

            aluno = Aluno(matricula, nome_completo, nome_da_mae, data_nascimento)
            self.alunos.append(aluno)

            messagebox.showinfo("Sucesso", "Aluno cadastrado com sucesso!")

            if self.exibicao_alunos_gui:
                self.exibicao_alunos_gui.atualizar_lista_alunos()

            self.window.destroy()
        except Exception as e:
            messagebox.showerror("Erro", f"Erro ao cadastrar aluno: {str(e)}")


class ExibeAlunosTkinter:
    def __init__(self, root, alunos):
        self.root = root
        self.alunos = alunos
        self.create_widgets()

    def create_widgets(self):
        self.window = tk.Toplevel(self.root)
        self.window.title("Exibição de Alunos")

        self.tree = ttk.Treeview(self.window, columns=("Matrícula", "Nome Completo", "Nome da Mãe", "Data Nascimento", "Data Cadastro"), show="headings")
        self.tree.heading("Matrícula", text="Matrícula")
        self.tree.heading("Nome Completo", text="Nome Completo")
        self.tree.heading("Nome da Mãe", text="Nome da Mãe")
        self.tree.heading("Data Nascimento", text="Data Nascimento")
        self.tree.heading("Data Cadastro", text="Data Cadastro")

        self.tree.pack(fill=tk.BOTH, expand=True)

        self.atualizar_lista_alunos()

    def atualizar_lista_alunos(self):
        for i in self.tree.get_children():
            self.tree.delete(i)

        for aluno in self.alunos:
            self.tree.insert("", "end", values=(aluno.matricula, aluno.nome_completo, aluno.nome_da_mae,
                                                aluno.data_nascimento.strftime("%d/%m/%Y"), aluno.data_cadastro.strftime("%d/%m/%Y")))


if __name__ == "__main__":
    root = tk.Tk()
    app = MainAlunoTkinter(root)
    root.mainloop()
