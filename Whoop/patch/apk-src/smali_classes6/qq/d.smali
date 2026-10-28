.class public final Lqq/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lkr/a;


# instance fields
.field public final a:Lkr/c;

.field public final b:Lkr/c;

.field public final c:Lkr/c;

.field public final d:Lkr/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkr/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkr/a;-><init>(F)V

    sput-object v0, Lqq/d;->e:Lkr/a;

    return-void
.end method

.method public constructor <init>(Lkr/c;Lkr/c;Lkr/c;Lkr/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqq/d;->a:Lkr/c;

    iput-object p3, p0, Lqq/d;->b:Lkr/c;

    iput-object p4, p0, Lqq/d;->c:Lkr/c;

    iput-object p2, p0, Lqq/d;->d:Lkr/c;

    return-void
.end method
