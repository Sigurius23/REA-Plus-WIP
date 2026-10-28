.class public final Llb/g;
.super La0/a0;
.source "SourceFile"


# instance fields
.field public final synthetic g:Llb/h;


# direct methods
.method public constructor <init>(Llb/h;)V
    .locals 0

    iput-object p1, p0, Llb/g;->g:Llb/h;

    const/16 p1, 0x19

    invoke-direct {p0, p1}, La0/a0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb/g;->g:Llb/h;

    iget-object v0, v0, Llb/h;->w:Ltb/a;

    invoke-interface {v0, p1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ltb/c;

    check-cast p4, Ltb/c;

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Ljava/lang/AutoCloseable;->close()V

    invoke-super {p0, p1, p2, p3, p4}, La0/a0;->b(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
