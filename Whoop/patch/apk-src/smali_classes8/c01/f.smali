.class public final synthetic Lc01/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Z

.field public final synthetic x:Ly2/j1;

.field public final synthetic y:Ly2/j1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ZLy2/j1;Ly2/j1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lc01/f;->w:Z

    iput-object p2, p0, Lc01/f;->x:Ly2/j1;

    iput-object p3, p0, Lc01/f;->y:Ly2/j1;

    iput p4, p0, Lc01/f;->z:I

    iput p5, p0, Lc01/f;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v4, p0, Lc01/f;->E:I

    move-object v5, p1

    check-cast v5, Ly2/i1;

    iget-boolean v0, p0, Lc01/f;->w:Z

    iget-object v1, p0, Lc01/f;->x:Ly2/j1;

    iget-object v2, p0, Lc01/f;->y:Ly2/j1;

    iget v3, p0, Lc01/f;->z:I

    invoke-static/range {v0 .. v5}, Lc01/e$k;->f(ZLy2/j1;Ly2/j1;IILy2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
