.class public final synthetic Lk80/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lg1/u0;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk80/g;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lk80/g;->x:Lg1/u0;

    iput-boolean p3, p0, Lk80/g;->y:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v3, p1

    check-cast v3, Ll0/s1;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lk80/g;->w:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lk80/g;->x:Lg1/u0;

    iget-boolean v2, p0, Lk80/g;->y:Z

    invoke-static/range {v0 .. v5}, Lk80/i;->c(Lcom/whoop/design/util/TextResource;Lg1/u0;ZLl0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
