.class public final Lw00/j0;
.super Lv00/p0;
.source "SourceFile"


# static fields
.field public static final a:Lw00/j0;

.field public static final b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public static final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    new-instance v0, Lw00/j0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw00/j0;->a:Lw00/j0;

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "p24[bank]"

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    sput-object v0, Lw00/j0;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "alior_bank"

    const-string v2, "Alior Bank"

    invoke-direct {v1, v0, v2}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "bank_millennium"

    const-string v3, "Bank Millenium"

    invoke-direct {v2, v0, v3}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "bank_nowy_bfg_sa"

    const-string v4, "Bank Nowy BFG S.A."

    invoke-direct {v3, v0, v4}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "bank_pekao_sa"

    const-string v5, "Bank PEKAO S.A"

    invoke-direct {v4, v0, v5}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "banki_spbdzielcze"

    const-string v6, "Bank sp\u00f3\u0142dzielczy"

    invoke-direct {v5, v0, v6}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "blik"

    const-string v7, "BLIK"

    invoke-direct {v6, v0, v7}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "bnp_paribas"

    const-string v8, "BNP Paribas"

    invoke-direct {v7, v0, v8}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v8, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "boz"

    const-string v9, "BOZ"

    invoke-direct {v8, v0, v9}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "citi_handlowy"

    const-string v10, "CitiHandlowy"

    invoke-direct {v9, v0, v10}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "credit_agricole"

    const-string v11, "Credit Agricole"

    invoke-direct {v10, v0, v11}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v11, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "etransfer_pocztowy24"

    const-string v12, "e-Transfer Pocztowy24"

    invoke-direct {v11, v0, v12}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v12, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "getin_bank"

    const-string v13, "Getin Bank"

    invoke-direct {v12, v0, v13}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "ideabank"

    const-string v14, "IdeaBank"

    invoke-direct {v13, v0, v14}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v14, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "ing"

    const-string v15, "ING"

    invoke-direct {v14, v0, v15}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v15, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "inteligo"

    invoke-direct {v15, v0, v0}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    move-object/from16 v16, v1

    const-string v1, "mbank_mtransfer"

    move-object/from16 v17, v2

    const-string v2, "mBank"

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v2, "nest_przelew"

    move-object/from16 v18, v0

    const-string v0, "Nest Przelew"

    invoke-direct {v1, v2, v0}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v2, "noble_pay"

    move-object/from16 v19, v1

    const-string v1, "Noble Pay"

    invoke-direct {v0, v2, v1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v2, "pbac_z_ipko"

    move-object/from16 v20, v0

    const-string v0, "P\u0142a\u0107 z iPKO (PKO BP)"

    invoke-direct {v1, v2, v0}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v2, "plus_bank"

    move-object/from16 v21, v1

    const-string v1, "Plus Bank"

    invoke-direct {v0, v2, v1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v2, "santander_przelew24"

    move-object/from16 v22, v0

    const-string v0, "Santander"

    invoke-direct {v1, v2, v0}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v2, "toyota_bank"

    move-object/from16 v23, v1

    const-string v1, "Toyota Bank"

    invoke-direct {v0, v2, v1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v2, "velobank"

    move-object/from16 v24, v0

    const-string v0, "VeloBank"

    invoke-direct {v1, v2, v0}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v2, "volkswagen_bank"

    move-object/from16 v25, v1

    const-string v1, "Volkswagen Bank"

    invoke-direct {v0, v2, v1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v16, v18

    move-object/from16 v17, v19

    move-object/from16 v18, v20

    move-object/from16 v19, v21

    move-object/from16 v20, v22

    move-object/from16 v21, v23

    move-object/from16 v22, v24

    move-object/from16 v23, v25

    move-object/from16 v24, v0

    filled-new-array/range {v1 .. v24}, [Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lw00/j0;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final k(Lv00/c0;Lv00/m0;Ld30/f0;)V
    .locals 4

    sget-object p1, Lu00/d;->w:Lu00/b;

    invoke-virtual {p3, p1}, Ld30/f0;->h(Lu00/d;)V

    invoke-virtual {p3, p1}, Ld30/f0;->g(Lu00/d;)V

    sget-object p1, Lu00/d;->y:Lu00/a;

    invoke-virtual {p3, p1}, Ld30/f0;->h(Lu00/d;)V

    invoke-virtual {p3, p1}, Ld30/f0;->g(Lu00/d;)V

    sget-object p1, Lu00/d;->x:Lu00/c;

    invoke-virtual {p3, p1}, Ld30/f0;->g(Lu00/d;)V

    new-instance p1, Lx30/p1;

    new-instance v0, Lg40/r0;

    new-instance v1, Lq/f;

    const v2, 0x7f14104c

    invoke-static {v2}, Ls4/i;->h(I)Lzy/b;

    move-result-object v2

    sget-object v3, Lw00/j0;->c:Ljava/util/List;

    invoke-direct {v1, v2, v3}, Lq/f;-><init>(Lzy/b;Ljava/util/List;)V

    iget-object p2, p2, Lv00/m0;->c:Ljava/util/LinkedHashMap;

    sget-object v2, Lw00/j0;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p2, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {v0, v1, p2}, Lg40/r0;-><init>(Lg40/p0;Ljava/lang/String;)V

    invoke-direct {p1, v2, v0}, Lx30/p1;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/r0;)V

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lg40/l0;->b(Lg40/y2;Lzy/c;)Lg40/w2;

    move-result-object p1

    invoke-virtual {p3, p1}, Ld30/f0;->d(Lg40/i1;)V

    return-void
.end method

.method public final l(Lv00/c0;)Lu00/f;
    .locals 10

    new-instance v0, Lu00/f;

    sget-object v1, Lw00/i0;->a:Lw00/i0;

    const/4 v8, 0x0

    const/16 v9, 0xe2

    const/4 v2, 0x0

    const v3, 0x7f1410ae

    const v4, 0x7f08082f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lu00/f;-><init>(Lv00/b0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;IILjava/lang/Integer;ZLzy/b;Ljava/lang/Integer;I)V

    return-object v0
.end method
