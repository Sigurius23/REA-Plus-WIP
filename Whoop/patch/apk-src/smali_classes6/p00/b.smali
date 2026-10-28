.class public final Lp00/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lp00/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp00/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp00/b;->w:Lp00/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v0

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    new-instance v14, Lcom/stripe/android/model/ConsentUi$ConsentSection;

    const-string v1, "By continuing you\u2019ll share your name, email, and phone with [Merchant]"

    invoke-direct {v14, v1}, Lcom/stripe/android/model/ConsentUi$ConsentSection;-><init>(Ljava/lang/String;)V

    new-instance v2, Lp00/q;

    const/4 v11, 0x1

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "(\u2022\u2022\u2022) \u2022\u2022\u2022 \u2022\u202255"

    const-string v10, "email@email.com"

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v15}, Lp00/q;-><init>(ZZLzy/c;ZZLjava/lang/String;Ljava/lang/String;ZZLq00/o;Lcom/stripe/android/model/ConsentUi$ConsentSection;Z)V

    new-instance v3, Lg40/o1;

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "otp"

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    new-instance v4, Lg40/m1;

    invoke-direct {v4}, Lg40/m1;-><init>()V

    invoke-direct {v3, v1, v4}, Lg40/o1;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/m1;)V

    move-object v10, v0

    check-cast v10, Lp1/q;

    const v0, -0x3454cb3f    # -2.2440322E7f

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_2

    new-instance v0, Lou1/a;

    const/4 v4, 0x7

    invoke-direct {v0, v4}, Lou1/a;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v4, v0

    check-cast v4, Lc93/a;

    const v0, -0x3454c5df    # -2.2443074E7f

    const/4 v5, 0x0

    invoke-static {v0, v10, v5}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    new-instance v0, Lou1/a;

    const/4 v6, 0x7

    invoke-direct {v0, v6}, Lou1/a;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Lc93/a;

    const v6, -0x3454bf1f    # -2.244653E7f

    invoke-static {v6, v10, v5}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_4

    new-instance v6, Lou1/a;

    const/4 v7, 0x7

    invoke-direct {v6, v7}, Lou1/a;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lc93/a;

    const v7, -0x3454b97f    # -2.244941E7f

    invoke-static {v7, v10, v5}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_5

    new-instance v7, Lou1/a;

    const/4 v8, 0x7

    invoke-direct {v7, v8}, Lou1/a;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v7, Lc93/a;

    const v8, -0x3454b3ff    # -2.2452226E7f

    invoke-static {v8, v10, v5}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_6

    new-instance v8, Lou1/a;

    const/4 v9, 0x7

    invoke-direct {v8, v9}, Lou1/a;-><init>(I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, Lc93/a;

    const v9, -0x3454aedf    # -2.245485E7f

    invoke-static {v9, v10, v5}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_7

    new-instance v9, Lou1/a;

    const/4 v1, 0x7

    invoke-direct {v9, v1}, Lou1/a;-><init>(I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v9, Lc93/a;

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    const v11, 0xdb6dc0

    move-object v5, v0

    invoke-static/range {v2 .. v11}, Lp00/h;->f(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
