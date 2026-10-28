.class public final synthetic Lrz0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic w:Lrz0/f;

.field public final synthetic x:J

.field public final synthetic y:Lt0/i;

.field public final synthetic z:Lrz0/a;


# direct methods
.method public synthetic constructor <init>(Lrz0/f;JLt0/i;Lrz0/a;Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrz0/b;->w:Lrz0/f;

    iput-wide p2, p0, Lrz0/b;->x:J

    iput-object p4, p0, Lrz0/b;->y:Lt0/i;

    iput-object p5, p0, Lrz0/b;->z:Lrz0/a;

    iput-object p6, p0, Lrz0/b;->E:Lc93/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lrz0/b;->w:Lrz0/f;

    iget-wide v1, p0, Lrz0/b;->x:J

    iget-object v3, p0, Lrz0/b;->y:Lt0/i;

    iget-object v4, p0, Lrz0/b;->z:Lrz0/a;

    iget-object v5, p0, Lrz0/b;->E:Lc93/m;

    invoke-static/range {v0 .. v7}, Lrz0/e;->b(Lrz0/f;JLt0/i;Lrz0/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
