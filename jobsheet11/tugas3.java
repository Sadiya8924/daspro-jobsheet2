import java.util.Scanner;

                        }
                    }
                    if (dataValid) {
                        System.out.println(
                                "Memulai transfer uang sebesar Rp." + (int) hasil_akhir + 
                                " ke " + bank_Karyawan[0] + "(" + bank_Karyawan[1] + ")");
                        transfStatus = true;                        
                        if (transfStatus) {
                            System.out.println("Transfer Berhasil");
                        } else {
                            System.out.println("Eror: ");
                            System.out.println("Transfer Gagal");
                        }
                    }
                }