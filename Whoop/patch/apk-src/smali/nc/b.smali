.class public abstract Lnc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnc/d;


# instance fields
.field public final a:Leb/o0;


# direct methods
.method public constructor <init>(Leb/o0;)V
    .locals 1

    const-string v0, "tracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/b;->a:Leb/o0;

    return-void
.end method


# virtual methods
.method public final a(Lic/e;)Lec3/c;
    .locals 2

    const-string v0, "constraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, La6/c;

    const/4 v0, 0x0

    const/16 v1, 0x1a

    invoke-direct {p1, p0, v0, v1}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p1

    return-object p1
.end method

.method public abstract c()I
.end method

.method public abstract d(Ljava/lang/Object;)Z
.end method
