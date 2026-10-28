.class final Lmz2/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmz2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lmz2/c;


# direct methods
.method public constructor <init>(Lmz2/c;)V
    .locals 0

    iput-object p1, p0, Lmz2/c$b$a;->w:Lmz2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lyw2/b;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyw2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmz2/c$b$a;->w:Lmz2/c;

    invoke-virtual {v0}, Lmz2/c;->m()Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Lyw2/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lyw2/b;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "found device "

    const-string v4, " with address "

    invoke-static {v3, v1, v4, v2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lmz2/c$b$a;->w:Lmz2/c;

    invoke-static {v0}, Lmz2/c;->d(Lmz2/c;)Lcom/whoop/whooplabs/io/HrDeviceConnection;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lyw2/b;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->v(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    const-string p1, "hrDeviceConnection"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lyw2/b;

    invoke-virtual {p0, p1, p2}, Lmz2/c$b$a;->b(Lyw2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
