.class public final Le4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Le4/b;


# instance fields
.field public final a:Ljava/lang/Float;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le4/b;

    invoke-direct {v0}, Le4/b;-><init>()V

    sput-object v0, Le4/b;->b:Le4/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le4/b;->a:Ljava/lang/Float;

    return-void
.end method
