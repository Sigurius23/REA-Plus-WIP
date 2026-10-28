.class public final synthetic Liw0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Liw0/l0;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Liw0/l0;Lkotlin/jvm/functions/Function1;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liw0/a0;->w:Liw0/l0;

    iput-object p2, p0, Liw0/a0;->x:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, Liw0/a0;->y:Z

    iput-boolean p4, p0, Liw0/a0;->z:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v4, p1

    check-cast v4, Lq0/r;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Liw0/a0;->w:Liw0/l0;

    iget-object v1, p0, Liw0/a0;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v2, p0, Liw0/a0;->y:Z

    iget-boolean v3, p0, Liw0/a0;->z:Z

    invoke-static/range {v0 .. v7}, Liw0/c0;->d(Liw0/l0;Lkotlin/jvm/functions/Function1;ZZLq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
