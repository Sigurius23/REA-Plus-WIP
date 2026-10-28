.class public final synthetic Lox2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JIJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lox2/a;->w:Ljava/lang/String;

    iput-object p2, p0, Lox2/a;->x:Ljava/lang/String;

    iput-wide p3, p0, Lox2/a;->y:J

    iput p5, p0, Lox2/a;->z:I

    iput-wide p6, p0, Lox2/a;->E:J

    iput p8, p0, Lox2/a;->F:I

    iput p9, p0, Lox2/a;->G:I

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

    iget-object v0, p0, Lox2/a;->w:Ljava/lang/String;

    iget-object v1, p0, Lox2/a;->x:Ljava/lang/String;

    iget-wide v2, p0, Lox2/a;->y:J

    iget v4, p0, Lox2/a;->z:I

    iget-wide v5, p0, Lox2/a;->E:J

    iget v7, p0, Lox2/a;->F:I

    iget v8, p0, Lox2/a;->G:I

    invoke-static/range {v0 .. v10}, Lox2/b;->b(Ljava/lang/String;Ljava/lang/String;JIJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
