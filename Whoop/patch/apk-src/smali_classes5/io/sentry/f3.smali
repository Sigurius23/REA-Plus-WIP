.class public final Lio/sentry/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/m1;


# static fields
.field public static final b:Lio/sentry/f3;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/f3;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/sentry/f3;-><init>(I)V

    sput-object v0, Lio/sentry/f3;->b:Lio/sentry/f3;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/f3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/m7;Lio/sentry/h4;Lio/sentry/n7;Lio/sentry/l;)Lio/sentry/n1;
    .locals 1

    iget v0, p0, Lio/sentry/f3;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lio/sentry/z6;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/sentry/z6;-><init>(Lio/sentry/m7;Lio/sentry/h4;Lio/sentry/n7;Lio/sentry/l;)V

    return-object v0

    :pswitch_0
    sget-object p1, Lio/sentry/g3;->a:Lio/sentry/g3;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
