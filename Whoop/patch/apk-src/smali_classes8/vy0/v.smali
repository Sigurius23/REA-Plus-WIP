.class public final synthetic Lvy0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Ly71/g;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Ly71/g;JJLc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvy0/v;->w:Ly71/g;

    iput-wide p2, p0, Lvy0/v;->x:J

    iput-wide p4, p0, Lvy0/v;->y:J

    iput-object p6, p0, Lvy0/v;->z:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v6, p1

    check-cast v6, Ll0/u;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lvy0/v;->w:Ly71/g;

    iget-wide v1, p0, Lvy0/v;->x:J

    iget-wide v3, p0, Lvy0/v;->y:J

    iget-object v5, p0, Lvy0/v;->z:Lc93/a;

    invoke-static/range {v0 .. v8}, Lvy0/x;->f(Ly71/g;JJLc93/a;Ll0/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
