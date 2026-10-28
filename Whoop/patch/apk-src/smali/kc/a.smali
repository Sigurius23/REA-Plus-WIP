.class public final Lkc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:Lkc/c;

.field public final b:Lad3/z;

.field public final c:Lic/y;

.field public final d:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "DelayedWorkTracker"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkc/a;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lkc/c;Lad3/z;Lic/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkc/a;->a:Lkc/c;

    iput-object p2, p0, Lkc/a;->b:Lad3/z;

    iput-object p3, p0, Lkc/a;->c:Lic/y;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lkc/a;->d:Ljava/util/HashMap;

    return-void
.end method
