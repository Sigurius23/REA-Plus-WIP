.class public final Lqc/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lic/g;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lic/g;)V
    .locals 1

    const-string v0, "progress"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/m;->a:Ljava/lang/String;

    iput-object p2, p0, Lqc/m;->b:Lic/g;

    return-void
.end method


# virtual methods
.method public final a()Lic/g;
    .locals 1

    iget-object v0, p0, Lqc/m;->b:Lic/g;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqc/m;->a:Ljava/lang/String;

    return-object v0
.end method
