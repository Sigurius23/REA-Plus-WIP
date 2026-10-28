.class final Lf92/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf92/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lf92/a;

.field final synthetic x:Ljk0/d;


# direct methods
.method public constructor <init>(Lf92/a;Ljk0/d;)V
    .locals 0

    iput-object p1, p0, Lf92/a$d$a;->w:Lf92/a;

    iput-object p2, p0, Lf92/a$d$a;->x:Ljk0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lst0/f;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lst0/f;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lst0/n;->a:Lst0/n;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lf92/a$d$a;->w:Lf92/a;

    iget-object p2, p0, Lf92/a$d$a;->x:Ljk0/d;

    invoke-static {p1, p2}, Lf92/a;->l(Lf92/a;Ljk0/d;)V

    goto :goto_0

    :cond_0
    sget-object p2, Lst0/m;->a:Lst0/m;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    iget-object p1, p0, Lf92/a$d$a;->w:Lf92/a;

    invoke-static {p1, v0}, Lf92/a;->l(Lf92/a;Ljk0/d;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lst0/i;

    if-nez p2, :cond_2

    sget-object p2, Lst0/k;->a:Lst0/k;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    sget-object p2, Lst0/g;->a:Lst0/g;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    iget-object p1, p0, Lf92/a$d$a;->w:Lf92/a;

    invoke-static {p1, v0}, Lf92/a;->l(Lf92/a;Ljk0/d;)V

    :cond_3
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lst0/f;

    invoke-virtual {p0, p1, p2}, Lf92/a$d$a;->b(Lst0/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
