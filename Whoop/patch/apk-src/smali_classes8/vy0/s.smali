.class public final synthetic Lvy0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Ld0/z1;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ly71/g;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ly71/g;JJLkotlin/jvm/functions/Function1;Ld0/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvy0/s;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lvy0/s;->x:Ly71/g;

    iput-wide p3, p0, Lvy0/s;->y:J

    iput-wide p5, p0, Lvy0/s;->z:J

    iput-object p7, p0, Lvy0/s;->E:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lvy0/s;->F:Ld0/z1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v8, p1

    check-cast v8, Ll0/u;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lvy0/s;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lvy0/s;->x:Ly71/g;

    iget-wide v2, p0, Lvy0/s;->y:J

    iget-wide v4, p0, Lvy0/s;->z:J

    iget-object v6, p0, Lvy0/s;->E:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lvy0/s;->F:Ld0/z1;

    invoke-static/range {v0 .. v10}, Lvy0/x;->e(Landroidx/compose/ui/Modifier;Ly71/g;JJLkotlin/jvm/functions/Function1;Ld0/z1;Ll0/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
