.class public final Lwk1/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwk1/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic x:Lwk1/b;


# direct methods
.method public constructor <init>(Lec3/m;Lwk1/b;)V
    .locals 0

    iput-object p2, p0, Lwk1/b$d$a;->x:Lwk1/b;

    iput-object p1, p0, Lwk1/b$d$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    check-cast p1, Lqw2/b;

    instance-of p2, p1, Lqw2/b$a;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lwk1/b$d$a;->x:Lwk1/b;

    invoke-static {p2}, Lwk1/b;->b(Lwk1/b;)Ltr2/n;

    move-result-object p2

    check-cast p1, Lqw2/b$a;

    invoke-virtual {p1}, Lqw2/b$a;->c()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Error performing Help Center call tile action: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lqw2/b$b;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lwk1/b$d$a;->x:Lwk1/b;

    invoke-static {p2}, Lwk1/b;->b(Lwk1/b;)Ltr2/n;

    move-result-object p2

    check-cast p1, Lqw2/b$b;

    invoke-virtual {p1}, Lqw2/b$b;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unhandled Help Center call tile interaction: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
