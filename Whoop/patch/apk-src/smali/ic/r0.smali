.class public abstract Lic/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/UUID;

.field public final b:Lqc/q;

.field public final c:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lqc/q;Ljava/util/Set;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workSpec"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic/r0;->a:Ljava/util/UUID;

    iput-object p2, p0, Lic/r0;->b:Lqc/q;

    iput-object p3, p0, Lic/r0;->c:Ljava/util/Set;

    return-void
.end method
