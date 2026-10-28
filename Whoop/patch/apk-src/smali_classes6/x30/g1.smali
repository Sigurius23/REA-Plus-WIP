.class public abstract Lx30/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/i1;


# instance fields
.field public final a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final b:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Z)V
    .locals 1

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx30/g1;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-boolean p2, p0, Lx30/g1;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lx30/g1;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final b(Z)V
    .locals 0

    return-void
.end method

.method public final c()Lzy/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lx30/g1;->b:Z

    return v0
.end method

.method public final f()Lec3/f2;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public abstract g(ZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
.end method
