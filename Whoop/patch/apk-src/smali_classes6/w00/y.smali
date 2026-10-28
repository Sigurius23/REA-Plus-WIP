.class public final Lw00/y;
.super Lv00/p0;
.source "SourceFile"


# static fields
.field public static final a:Lw00/y;

.field public static final b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public static final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Lw00/y;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw00/y;->a:Lw00/y;

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "fpx[bank]"

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    sput-object v0, Lw00/y;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "affin_bank"

    const-string v2, "Affin Bank"

    invoke-direct {v1, v0, v2}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "alliance_bank"

    const-string v3, "Alliance Bank"

    invoke-direct {v2, v0, v3}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "ambank"

    const-string v4, "AmBank"

    invoke-direct {v3, v0, v4}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "bank_islam"

    const-string v5, "Bank Islam"

    invoke-direct {v4, v0, v5}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "bank_muamalat"

    const-string v6, "Bank Muamalat"

    invoke-direct {v5, v0, v6}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "bank_rakyat"

    const-string v7, "Bank Rakyat"

    invoke-direct {v6, v0, v7}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "bsn"

    const-string v8, "BSN"

    invoke-direct {v7, v0, v8}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v8, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "cimb"

    const-string v9, "CIMB Clicks"

    invoke-direct {v8, v0, v9}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "hong_leong_bank"

    const-string v10, "Hong Leong Bank"

    invoke-direct {v9, v0, v10}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "hsbc"

    const-string v11, "HSBC BANK"

    invoke-direct {v10, v0, v11}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v11, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "kfh"

    const-string v12, "KFH"

    invoke-direct {v11, v0, v12}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v12, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "maybank2e"

    const-string v13, "Maybank2E"

    invoke-direct {v12, v0, v13}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "maybank2u"

    const-string v14, "Maybank2U"

    invoke-direct {v13, v0, v14}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v14, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "ocbc"

    const-string v15, "OCBC Bank"

    invoke-direct {v14, v0, v15}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v15, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v0, "public_bank"

    move-object/from16 v16, v1

    const-string v1, "Public Bank"

    invoke-direct {v15, v0, v1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v1, "rhb"

    move-object/from16 v17, v2

    const-string v2, "RHB Bank"

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v2, "standard_chartered"

    move-object/from16 v18, v0

    const-string v0, "Standard Chartered"

    invoke-direct {v1, v2, v0}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    const-string v2, "uob"

    move-object/from16 v19, v1

    const-string v1, "UOB Bank"

    invoke-direct {v0, v2, v1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v16, v18

    move-object/from16 v17, v19

    move-object/from16 v18, v0

    filled-new-array/range {v1 .. v18}, [Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lw00/y;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final k(Lv00/c0;Lv00/m0;Ld30/f0;)V
    .locals 4

    new-instance p1, Lx30/p1;

    new-instance v0, Lg40/r0;

    new-instance v1, Lq/f;

    const v2, 0x7f14100a

    invoke-static {v2}, Ls4/i;->h(I)Lzy/b;

    move-result-object v2

    sget-object v3, Lw00/y;->c:Ljava/util/List;

    invoke-direct {v1, v2, v3}, Lq/f;-><init>(Lzy/b;Ljava/util/List;)V

    iget-object p2, p2, Lv00/m0;->c:Ljava/util/LinkedHashMap;

    sget-object v2, Lw00/y;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

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

    sget-object v1, Lw00/x;->a:Lw00/x;

    const/4 v8, 0x0

    const/16 v9, 0xc2

    const/4 v2, 0x0

    const v3, 0x7f1410a4

    const v4, 0x7f080825

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lu00/f;-><init>(Lv00/b0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;IILjava/lang/Integer;ZLzy/b;Ljava/lang/Integer;I)V

    return-object v0
.end method
