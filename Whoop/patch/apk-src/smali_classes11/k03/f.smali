.class public final synthetic Lk03/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk03/f;->w:F

    iput-boolean p3, p0, Lk03/f;->x:Z

    iput-object p2, p0, Lk03/f;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v3, p1

    check-cast v3, Lv6/g;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lk03/f;->w:F

    iget-boolean v1, p0, Lk03/f;->x:Z

    iget-object v2, p0, Lk03/f;->y:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lk03/n;->t(FZLjava/lang/String;Lv6/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
