.class public final synthetic Lrz0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lf0/t;

.field public final synthetic F:Lrz0/a;

.field public final synthetic G:F

.field public final synthetic H:Lc93/m;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lrz0/f;

.field public final synthetic y:J

.field public final synthetic z:Lt0/i;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrz0/c;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lrz0/c;->x:Lrz0/f;

    iput-wide p3, p0, Lrz0/c;->y:J

    iput-object p5, p0, Lrz0/c;->z:Lt0/i;

    iput-object p6, p0, Lrz0/c;->E:Lf0/t;

    iput-object p7, p0, Lrz0/c;->F:Lrz0/a;

    iput p8, p0, Lrz0/c;->G:F

    iput-object p9, p0, Lrz0/c;->H:Lc93/m;

    iput p10, p0, Lrz0/c;->I:I

    iput p11, p0, Lrz0/c;->J:I

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

    iget-object v0, p0, Lrz0/c;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lrz0/c;->x:Lrz0/f;

    iget-wide v2, p0, Lrz0/c;->y:J

    iget-object v4, p0, Lrz0/c;->z:Lt0/i;

    iget-object v5, p0, Lrz0/c;->E:Lf0/t;

    iget-object v6, p0, Lrz0/c;->F:Lrz0/a;

    iget v7, p0, Lrz0/c;->G:F

    iget-object v8, p0, Lrz0/c;->H:Lc93/m;

    iget v9, p0, Lrz0/c;->I:I

    iget v10, p0, Lrz0/c;->J:I

    invoke-static/range {v0 .. v12}, Lrz0/e;->h(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
