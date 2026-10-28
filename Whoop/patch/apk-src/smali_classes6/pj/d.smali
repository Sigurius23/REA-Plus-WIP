.class public final Lpj/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lpj/d;


# instance fields
.field public a:Z

.field public final b:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpj/d;

    invoke-direct {v0}, Lpj/d;-><init>()V

    sput-object v0, Lpj/d;->c:Lpj/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpj/d;->b:Ljava/util/ArrayList;

    return-void
.end method
