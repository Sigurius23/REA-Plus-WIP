.class public final synthetic Lxq2/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Z

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(IJZLc93/m;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lxq2/p0;->w:I

    iput-wide p2, p0, Lxq2/p0;->x:J

    iput-boolean p4, p0, Lxq2/p0;->y:Z

    iput-object p5, p0, Lxq2/p0;->z:Lc93/m;

    iput p6, p0, Lxq2/p0;->E:I

    iput p7, p0, Lxq2/p0;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v0, p0, Lxq2/p0;->w:I

    iget-wide v1, p0, Lxq2/p0;->x:J

    iget-boolean v3, p0, Lxq2/p0;->y:Z

    iget-object v4, p0, Lxq2/p0;->z:Lc93/m;

    iget v5, p0, Lxq2/p0;->E:I

    iget v6, p0, Lxq2/p0;->F:I

    invoke-static/range {v0 .. v8}, Lxq2/q0;->d(IJZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
