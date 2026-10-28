.class final Lv92/c$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv92/c;->o(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lf6/a;",
        "prefs",
        "Ll83/a0;",
        "<anonymous>",
        "(Lf6/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.store.encrypted.EncryptedAuthStore$storeAuthMaterialDataStore$2"
    f = "EncryptedAuthStore.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic F:I

.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lq83/d<",
            "-",
            "Lv92/c$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv92/c$g;->y:Ljava/lang/String;

    iput-object p2, p0, Lv92/c$g;->z:Ljava/lang/String;

    iput p3, p0, Lv92/c$g;->E:I

    iput p4, p0, Lv92/c$g;->F:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lv92/c$g;

    iget-object v1, p0, Lv92/c$g;->y:Ljava/lang/String;

    iget-object v2, p0, Lv92/c$g;->z:Ljava/lang/String;

    iget v3, p0, Lv92/c$g;->E:I

    iget v4, p0, Lv92/c$g;->F:I

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lv92/c$g;-><init>(Ljava/lang/String;Ljava/lang/String;IILq83/d;)V

    iput-object p1, v0, Lv92/c$g;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lv92/c$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv92/c$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv92/c$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lf6/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv92/c$g;->invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lv92/c$g;->x:Ljava/lang/Object;

    check-cast v0, Lf6/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lv92/c$g;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lv92/c;->e()Lf6/d;

    move-result-object p1

    iget-object v1, p0, Lv92/c$g;->y:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    invoke-static {}, Lv92/c;->f()Lf6/d;

    move-result-object p1

    iget-object v1, p0, Lv92/c$g;->z:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    invoke-static {}, Lv92/c;->h()Lf6/d;

    move-result-object p1

    iget v1, p0, Lv92/c$g;->E:I

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, p1, v2}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    invoke-static {}, Lv92/c;->j()Lf6/d;

    move-result-object p1

    iget v1, p0, Lv92/c$g;->F:I

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, p1, v2}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
