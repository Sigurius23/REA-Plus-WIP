.class public final synthetic Lk03/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:Ln6/o;

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ln6/o;ILjava/lang/String;Ljava/lang/String;JIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk03/k;->w:Ln6/o;

    iput p2, p0, Lk03/k;->x:I

    iput-object p3, p0, Lk03/k;->y:Ljava/lang/String;

    iput-object p4, p0, Lk03/k;->z:Ljava/lang/String;

    iput-wide p5, p0, Lk03/k;->E:J

    iput p7, p0, Lk03/k;->F:I

    iput p8, p0, Lk03/k;->G:I

    iput p9, p0, Lk03/k;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lk03/k;->w:Ln6/o;

    iget v1, p0, Lk03/k;->x:I

    iget-object v2, p0, Lk03/k;->y:Ljava/lang/String;

    iget-object v3, p0, Lk03/k;->z:Ljava/lang/String;

    iget-wide v4, p0, Lk03/k;->E:J

    iget v6, p0, Lk03/k;->F:I

    iget v7, p0, Lk03/k;->G:I

    iget v8, p0, Lk03/k;->H:I

    invoke-static/range {v0 .. v10}, Lk03/n;->j(Ln6/o;ILjava/lang/String;Ljava/lang/String;JIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
