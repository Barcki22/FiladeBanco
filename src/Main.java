import java.util.Scanner;

void main(){


    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o tamanho máximo da fila: ");
    int capacidade = scanner.nextInt();
    scanner.nextLine();

    FilaBanco fila = new FilaBanco(capacidade);

    int opcao = -1;
    while (opcao != 0) {
        System.out.println("\n===== BANCO - SISTEMA DE ATENDIMENTO =====");
        System.out.println("Fila: " + fila.getTamanho() + "/" + fila.getCapacidade() + " clientes");
        System.out.println("------------------------------------------");
        System.out.println("1. Adicionar cliente");
        System.out.println("2. Atender próximo cliente");
        System.out.println("3. Listar clientes aguardando");
        System.out.println("0. Sair");
        System.out.println("------------------------------------------");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (opcao == 1) {
            System.out.print("Nome do cliente: ");
            System.out.println(fila.enqueue(scanner.nextLine()));
        } else if (opcao == 2) {
            System.out.println(fila.dequeue());
        } else if (opcao == 3) {
            System.out.println(fila.front());
        } else if (opcao == 0) {
            System.out.println("Sistema encerrado. Até logo!");
        } else {
            System.out.println("Opção inválida! Tente novamente.");
        }




    }
    while (opcao != 0);

}





