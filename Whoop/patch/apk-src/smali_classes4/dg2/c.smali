.class public final Ldg2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Ldg2/c;",
        "",
        "<init>",
        "()V",
        "Lbg2/d;",
        "domainState",
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "(Lbg2/d;)Lcom/whoop/design/util/TextResource;",
        "",
        "phoneNumber",
        "b",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Ldg2/b;",
        "c",
        "(Lbg2/d;)Ldg2/b;",
        "sms_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lbg2/d;)Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p1}, Lbg2/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p1}, Lbg2/d;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lbg2/d;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lvf2/b;->l:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1
.end method

.method private final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x5

    invoke-static {v0, p1}, Lyb3/r;->M0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr p1, v1

    const-string v1, "*"

    invoke-static {p1, v1}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "+"

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Lbg2/d;)Ldg2/b;
    .locals 16

    const-string v0, "domainState"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ldg2/b;

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->i()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v3, p0

    invoke-direct {v3, v0}, Ldg2/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->p()Z

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->k()Z

    move-result v5

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->j()Z

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->m()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->f()Z

    move-result v8

    invoke-direct/range {p0 .. p1}, Ldg2/c;->a(Lbg2/d;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->q()Z

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->r()Z

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->h()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->o()Z

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lbg2/d;->n()Z

    move-result v15

    move-object v3, v0

    invoke-direct/range {v1 .. v15}, Ldg2/b;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZLcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLjava/lang/String;ZZ)V

    return-object v1
.end method
