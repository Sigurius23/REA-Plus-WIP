.class public final Lio/sentry/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/z1;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/d2;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/sentry/d2;->a:Ljava/lang/Object;

    return-object v0
.end method
