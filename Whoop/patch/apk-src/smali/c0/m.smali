.class public final Lc0/m;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:[Ly2/j1;

.field public final synthetic x:Lc0/n;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public constructor <init>([Ly2/j1;Lc0/n;II)V
    .locals 0

    iput-object p1, p0, Lc0/m;->w:[Ly2/j1;

    iput-object p2, p0, Lc0/m;->x:Lc0/n;

    iput p3, p0, Lc0/m;->y:I

    iput p4, p0, Lc0/m;->z:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    iget-object v2, v0, Lc0/m;->w:[Ly2/j1;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    if-eqz v5, :cond_0

    iget-object v6, v0, Lc0/m;->x:Lc0/n;

    iget-object v6, v6, Lc0/n;->a:Lc0/x;

    iget-object v7, v6, Lc0/x;->b:Lb2/h;

    iget v6, v5, Ly2/j1;->w:I

    iget v8, v5, Ly2/j1;->x:I

    int-to-long v9, v6

    const/16 v6, 0x20

    shl-long/2addr v9, v6

    int-to-long v11, v8

    const-wide v13, 0xffffffffL

    and-long/2addr v11, v13

    or-long v8, v9, v11

    iget v10, v0, Lc0/m;->y:I

    int-to-long v10, v10

    shl-long/2addr v10, v6

    iget v12, v0, Lc0/m;->z:I

    move v15, v6

    move-object/from16 p1, v7

    int-to-long v6, v12

    and-long/2addr v6, v13

    or-long/2addr v10, v6

    sget-object v12, Ly3/m;->w:Ly3/m;

    move-object/from16 v7, p1

    invoke-interface/range {v7 .. v12}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v6

    shr-long v8, v6, v15

    long-to-int v8, v8

    and-long/2addr v6, v13

    long-to-int v6, v6

    invoke-static {v5, v8, v6, v1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
