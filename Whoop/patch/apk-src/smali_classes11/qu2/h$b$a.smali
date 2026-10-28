.class final Lqu2/h$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqu2/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic x:Lb3/x2;

.field final synthetic y:Lg2/i;


# direct methods
.method public constructor <init>(Lp1/c1;Lb3/x2;Lg2/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lb3/x2;",
            "Lg2/i;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lqu2/h$b$a;->w:Lp1/c1;

    iput-object p2, p0, Lqu2/h$b$a;->x:Lb3/x2;

    iput-object p3, p0, Lqu2/h$b$a;->y:Lg2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lqu2/h$b$a;->w:Lp1/c1;

    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {p2, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lqu2/h$b$a;->x:Lb3/x2;

    if-eqz p1, :cond_0

    check-cast p1, Lb3/x1;

    invoke-virtual {p1}, Lb3/x1;->a()V

    :cond_0
    iget-object p1, p0, Lqu2/h$b$a;->y:Lg2/i;

    invoke-static {p1}, Lg2/i;->a(Lg2/i;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lqu2/h$b$a;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
