.class public final synthetic Llj1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/time/temporal/TemporalQuery;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llj1/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final queryFrom(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llj1/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Ljava/time/ZonedDateTime;->from(Ljava/time/temporal/TemporalAccessor;)Ljava/time/ZonedDateTime;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Ljava/time/ZoneOffset;->from(Ljava/time/temporal/TemporalAccessor;)Ljava/time/ZoneOffset;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Ljava/time/Instant;->from(Ljava/time/temporal/TemporalAccessor;)Ljava/time/Instant;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
