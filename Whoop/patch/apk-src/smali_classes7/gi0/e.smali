.class public final synthetic Lgi0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:D

.field public final synthetic b:D


# direct methods
.method public synthetic constructor <init>(DD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lgi0/e;->a:D

    iput-wide p3, p0, Lgi0/e;->b:D

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-wide v0, p0, Lgi0/e;->b:D

    check-cast p1, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    iget-wide v2, p0, Lgi0/e;->a:D

    invoke-static {v2, v3, v0, v1, p1}, Lgi0/f;->b(DDLcom/whoop/analytics/strain/model/HeartRateTimestamp;)Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    move-result-object p1

    return-object p1
.end method
