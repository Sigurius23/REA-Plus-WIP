.class public abstract Lcq/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcq/s;

.field public static final b:Lcq/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcq/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcq/s;-><init>(I)V

    sput-object v0, Lcq/j;->a:Lcq/s;

    new-instance v0, Lcq/r;

    invoke-direct {v0, v1}, Lcq/r;-><init>(I)V

    sput-object v0, Lcq/j;->b:Lcq/r;

    return-void
.end method
