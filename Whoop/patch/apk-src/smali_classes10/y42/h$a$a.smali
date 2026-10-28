.class final Ly42/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly42/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Ly42/h;


# direct methods
.method public constructor <init>(Ly42/h;)V
    .locals 0

    iput-object p1, p0, Ly42/h$a$a;->w:Ly42/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Llt0/c;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llt0/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lfk0/h;

    if-eqz p2, :cond_0

    iget-object p2, p0, Ly42/h$a$a;->w:Ly42/h;

    invoke-static {p2}, Ly42/h;->T0(Ly42/h;)Lec3/p1;

    move-result-object p2

    check-cast p1, Lfk0/h;

    invoke-virtual {p1}, Lfk0/h;->T()Lws0/a;

    move-result-object p1

    check-cast p2, Lec3/h2;

    invoke-virtual {p2, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llt0/c;

    invoke-virtual {p0, p1, p2}, Ly42/h$a$a;->b(Llt0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
