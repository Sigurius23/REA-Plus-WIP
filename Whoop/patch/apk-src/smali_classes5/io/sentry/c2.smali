.class public final Lio/sentry/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/z1;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/c2;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/sentry/c2;->a:Ljava/lang/String;

    return-object v0
.end method
