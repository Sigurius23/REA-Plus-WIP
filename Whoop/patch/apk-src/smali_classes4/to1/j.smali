.class public final synthetic Lto1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Loo1/h$a;

.field public final synthetic z:Ljb1/a;


# direct methods
.method public synthetic constructor <init>(ZZLoo1/h$a;Ljb1/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lto1/j;->w:Z

    iput-boolean p2, p0, Lto1/j;->x:Z

    iput-object p3, p0, Lto1/j;->y:Loo1/h$a;

    iput-object p4, p0, Lto1/j;->z:Ljb1/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lto1/j;->z:Ljb1/a;

    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;

    iget-boolean v1, p0, Lto1/j;->w:Z

    iget-boolean v2, p0, Lto1/j;->x:Z

    iget-object v3, p0, Lto1/j;->y:Loo1/h$a;

    invoke-static {v1, v2, v3, v0, p1}, Lto1/l;->w(ZZLoo1/h$a;Ljb1/a;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;)Lso1/c;

    move-result-object p1

    return-object p1
.end method
