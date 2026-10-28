.class public final synthetic Lk03/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Ln6/o;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Ln6/o;Ljava/lang/String;Ljava/lang/String;JIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk03/m;->w:Ln6/o;

    iput-object p2, p0, Lk03/m;->x:Ljava/lang/String;

    iput-object p3, p0, Lk03/m;->y:Ljava/lang/String;

    iput-wide p4, p0, Lk03/m;->z:J

    iput p6, p0, Lk03/m;->E:I

    iput p7, p0, Lk03/m;->F:I

    iput p8, p0, Lk03/m;->G:I

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

    iget-object v0, p0, Lk03/m;->w:Ln6/o;

    iget-object v1, p0, Lk03/m;->x:Ljava/lang/String;

    iget-object v2, p0, Lk03/m;->y:Ljava/lang/String;

    iget-wide v3, p0, Lk03/m;->z:J

    iget v5, p0, Lk03/m;->E:I

    iget v6, p0, Lk03/m;->F:I

    iget v7, p0, Lk03/m;->G:I

    invoke-static/range {v0 .. v9}, Lk03/n;->p(Ln6/o;Ljava/lang/String;Ljava/lang/String;JIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
