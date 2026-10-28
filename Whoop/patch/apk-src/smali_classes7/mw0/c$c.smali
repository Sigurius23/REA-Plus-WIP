.class final Lmw0/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmw0/c;-><init>(Ljw0/d;Lmw0/e;)V
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

.field final synthetic x:Lmw0/c;


# direct methods
.method public constructor <init>(Lec3/m;Lmw0/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lmw0/c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lmw0/c$c;->w:Lec3/m;

    iput-object p2, p0, Lmw0/c$c;->x:Lmw0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljw0/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljw0/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmw0/c$c;->w:Lec3/m;

    iget-object v1, p0, Lmw0/c$c;->x:Lmw0/c;

    invoke-static {v1}, Lmw0/c;->j(Lmw0/c;)Lmw0/e;

    move-result-object v1

    invoke-virtual {v1, p1}, Lmw0/e;->a(Ljw0/c;)Lmw0/d;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljw0/c;

    invoke-virtual {p0, p1, p2}, Lmw0/c$c;->b(Ljw0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
