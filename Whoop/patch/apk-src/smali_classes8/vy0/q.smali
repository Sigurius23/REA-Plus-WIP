.class public final synthetic Lvy0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:Ly2/j1;

.field public final synthetic y:I

.field public final synthetic z:Ly2/j1;


# direct methods
.method public synthetic constructor <init>(FLy2/j1;ILy2/j1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lvy0/q;->w:F

    iput-object p2, p0, Lvy0/q;->x:Ly2/j1;

    iput p3, p0, Lvy0/q;->y:I

    iput-object p4, p0, Lvy0/q;->z:Ly2/j1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lvy0/q;->z:Ly2/j1;

    check-cast p1, Ly2/i1;

    iget v1, p0, Lvy0/q;->w:F

    iget-object v2, p0, Lvy0/q;->x:Ly2/j1;

    iget v3, p0, Lvy0/q;->y:I

    invoke-static {v1, v2, v3, v0, p1}, Lvy0/p$b;->f(FLy2/j1;ILy2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
