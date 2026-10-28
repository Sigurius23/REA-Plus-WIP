.class public final synthetic Lx31/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lb91/a;

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lc93/m;

.field public final synthetic y:I

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lc93/m;IJLkotlin/jvm/functions/Function1;Lb91/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx31/e;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lx31/e;->x:Lc93/m;

    iput p3, p0, Lx31/e;->y:I

    iput-wide p4, p0, Lx31/e;->z:J

    iput-object p6, p0, Lx31/e;->E:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lx31/e;->F:Lb91/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Ll0/y;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lx31/e;->w:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lx31/e;->x:Lc93/m;

    iget v2, p0, Lx31/e;->y:I

    iget-wide v3, p0, Lx31/e;->z:J

    iget-object v5, p0, Lx31/e;->E:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lx31/e;->F:Lb91/a;

    invoke-static/range {v0 .. v9}, Lx31/f;->a(Lcom/whoop/design/util/TextResource;Lc93/m;IJLkotlin/jvm/functions/Function1;Lb91/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
