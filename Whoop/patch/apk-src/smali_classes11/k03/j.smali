.class public final synthetic Lk03/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ln6/o;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;JILn6/o;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk03/j;->w:I

    iput-object p2, p0, Lk03/j;->x:Ljava/lang/String;

    iput-wide p3, p0, Lk03/j;->y:J

    iput p5, p0, Lk03/j;->z:I

    iput-object p6, p0, Lk03/j;->E:Ln6/o;

    iput p7, p0, Lk03/j;->F:I

    iput p8, p0, Lk03/j;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v0, p0, Lk03/j;->w:I

    iget-object v1, p0, Lk03/j;->x:Ljava/lang/String;

    iget-wide v2, p0, Lk03/j;->y:J

    iget v4, p0, Lk03/j;->z:I

    iget-object v5, p0, Lk03/j;->E:Ln6/o;

    iget v6, p0, Lk03/j;->F:I

    iget v7, p0, Lk03/j;->G:I

    invoke-static/range {v0 .. v9}, Lk03/n;->s(ILjava/lang/String;JILn6/o;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
