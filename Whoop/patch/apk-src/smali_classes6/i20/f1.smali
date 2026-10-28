.class public final Li20/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final a:Lk83/a;


# direct methods
.method public constructor <init>(Lk83/a;)V
    .locals 1

    const-string v0, "inputAddressViewModelSubcomponentFactoryProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li20/f1;->a:Lk83/a;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 3

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li20/f1;->a:Lk83/a;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp20/d;

    iget-object p1, p1, Lp20/d;->a:Lkr/j;

    new-instance v0, Li20/j1;

    iget-object v1, p1, Lkr/j;->a:Ljava/lang/Object;

    check-cast v1, Li20/h;

    iget-object v2, p1, Lkr/j;->c:Ljava/lang/Object;

    check-cast v2, Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li20/k1;

    iget-object p1, p1, Lkr/j;->k:Ljava/lang/Object;

    check-cast p1, Lv03/h;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj20/c;

    invoke-direct {v0, v1, v2, p1}, Li20/j1;-><init>(Li20/h;Li20/k1;Lj20/c;)V

    return-object v0
.end method
