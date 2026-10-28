.class public abstract Lwn/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn/n;->a:Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lwn/n;->b:Ljava/util/List;

    iput-boolean p3, p0, Lwn/n;->c:Z

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/util/List;)Ljava/lang/Object;
.end method
