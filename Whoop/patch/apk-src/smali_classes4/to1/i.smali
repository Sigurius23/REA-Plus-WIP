.class public final synthetic Lto1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lto1/i;->w:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lto1/i;->w:Z

    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TypicalCycleTileModel;

    invoke-static {v0, p1}, Lto1/l;->n(ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TypicalCycleTileModel;)Lso1/n0;

    move-result-object p1

    return-object p1
.end method
