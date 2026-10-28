.class public final Lrm/g0;
.super Lrm/f0;
.source "SourceFile"


# static fields
.field public static final G:Lrm/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrm/e0;

    invoke-direct {v0}, Lrm/e0;-><init>()V

    new-instance v1, Lrm/g0;

    invoke-direct {v1, v0}, Lrm/f0;-><init>(Lrm/e0;)V

    sput-object v1, Lrm/g0;->G:Lrm/g0;

    return-void
.end method
