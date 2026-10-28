.class public final Lh6/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lqt/e;


# instance fields
.field public final a:Lh6/i;

.field public b:I

.field public final c:Lh6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqt/e;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Lh6/t;->d:Lqt/e;

    return-void
.end method

.method public constructor <init>(Lh6/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lh6/t;->b:I

    new-instance v0, Lh6/c;

    invoke-direct {v0}, Lh6/c;-><init>()V

    iput-object v0, p0, Lh6/t;->c:Lh6/c;

    iput-object p1, p0, Lh6/t;->a:Lh6/i;

    return-void
.end method
