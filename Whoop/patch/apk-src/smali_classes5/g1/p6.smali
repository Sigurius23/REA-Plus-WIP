.class public final synthetic Lg1/p6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Ly2/j1;

.field public final synthetic x:I

.field public final synthetic y:Ly2/j1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ly2/j1;ILy2/j1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/p6;->w:Ly2/j1;

    iput p2, p0, Lg1/p6;->x:I

    iput-object p3, p0, Lg1/p6;->y:Ly2/j1;

    iput p4, p0, Lg1/p6;->z:I

    iput p5, p0, Lg1/p6;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ly2/i1;

    const/4 v0, 0x0

    iget-object v1, p0, Lg1/p6;->w:Ly2/j1;

    iget v2, p0, Lg1/p6;->x:I

    invoke-static {v1, v0, v2, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    iget-object v0, p0, Lg1/p6;->y:Ly2/j1;

    iget v1, p0, Lg1/p6;->z:I

    iget v2, p0, Lg1/p6;->E:I

    invoke-static {v0, v1, v2, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
