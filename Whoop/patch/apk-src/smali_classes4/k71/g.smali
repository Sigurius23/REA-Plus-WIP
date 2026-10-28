.class public final synthetic Lk71/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic w:F

.field public final synthetic x:Lk71/m;

.field public final synthetic y:Z

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(FLk71/m;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk71/g;->w:F

    iput-object p2, p0, Lk71/g;->x:Lk71/m;

    iput-boolean p3, p0, Lk71/g;->y:Z

    iput-object p4, p0, Lk71/g;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lk71/g;->E:Ljava/lang/String;

    iput-object p6, p0, Lk71/g;->F:Ljava/lang/String;

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

    iget v0, p0, Lk71/g;->w:F

    iget-object v1, p0, Lk71/g;->x:Lk71/m;

    iget-boolean v2, p0, Lk71/g;->y:Z

    iget-object v3, p0, Lk71/g;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lk71/g;->E:Ljava/lang/String;

    iget-object v5, p0, Lk71/g;->F:Ljava/lang/String;

    invoke-static/range {v0 .. v7}, Lk71/j;->j(FLk71/m;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
