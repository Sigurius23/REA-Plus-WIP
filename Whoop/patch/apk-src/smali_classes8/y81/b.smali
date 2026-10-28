.class public final synthetic Ly81/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:J

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(JJJJLc93/m;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ly81/b;->w:J

    iput-wide p3, p0, Ly81/b;->x:J

    iput-wide p5, p0, Ly81/b;->y:J

    iput-wide p7, p0, Ly81/b;->z:J

    iput-object p9, p0, Ly81/b;->E:Lc93/m;

    iput p10, p0, Ly81/b;->F:I

    iput p11, p0, Ly81/b;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-wide v0, p0, Ly81/b;->w:J

    iget-wide v2, p0, Ly81/b;->x:J

    iget-wide v4, p0, Ly81/b;->y:J

    iget-wide v6, p0, Ly81/b;->z:J

    iget-object v8, p0, Ly81/b;->E:Lc93/m;

    iget v9, p0, Ly81/b;->F:I

    iget v10, p0, Ly81/b;->G:I

    invoke-static/range {v0 .. v12}, Ly81/c;->a(JJJJLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
