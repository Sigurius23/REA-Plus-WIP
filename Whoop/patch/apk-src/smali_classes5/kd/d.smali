.class public final Lkd/d;
.super Lvo/b;
.source "SourceFile"


# static fields
.field public static final synthetic b:Lkd/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkd/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkd/d;->b:Lkd/d;

    return-void
.end method


# virtual methods
.method public final I(Lkd/b;Ls/m2;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lkd/c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lkd/c;

    iget v1, v0, Lkd/c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkd/c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkd/c;

    invoke-direct {v0, p0, p3}, Lkd/c;-><init>(Lkd/d;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lkd/c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkd/c;->F:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lkd/c;->y:Lkd/e;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p2, v0, Lkd/c;->x:Ls/m2;

    iget-object p1, v0, Lkd/c;->w:Lkd/b;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lkd/c;->w:Lkd/b;

    iput-object p2, v0, Lkd/c;->x:Ls/m2;

    iput v5, v0, Lkd/c;->F:I

    if-ne v3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p1, Lkd/b;->c:Lkd/e;

    iget-object p3, p1, Lkd/e;->g:Lcg/o;

    if-nez p3, :cond_6

    const/4 p3, 0x0

    iput-object p3, v0, Lkd/c;->w:Lkd/b;

    iput-object p3, v0, Lkd/c;->x:Ls/m2;

    iput-object p1, v0, Lkd/c;->y:Lkd/e;

    iput v4, v0, Lkd/c;->F:I

    const-string p3, "SsoOidc"

    const-string v2, "SSO_OIDC"

    const-string v4, "sso_oidc"

    invoke-static {p2, p3, v2, v4, v0}, Lvd/e;->R(Ls/m2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p3, Lcg/o;

    :cond_6
    iput-object p3, p1, Lkd/e;->g:Lcg/o;

    return-object v3
.end method

.method public final b()Lwb3/f;
    .locals 1

    new-instance v0, Lkd/b;

    invoke-direct {v0}, Lkd/b;-><init>()V

    return-object v0
.end method

.method public final n(Lwb3/f;)V
    .locals 2

    check-cast p1, Lkd/b;

    iget-object p1, p1, Lkd/b;->c:Lkd/e;

    iget-object p1, p1, Lkd/e;->h:Ljava/util/ArrayList;

    new-instance v0, Lye/b;

    invoke-direct {v0}, Lye/b;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic o(Lwb3/f;Ls/m2;Ls/m2;Lyd/a;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkd/b;

    invoke-virtual {p0, p1, p2, p4}, Lkd/d;->I(Lkd/b;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
