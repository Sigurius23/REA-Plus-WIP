.class public final Lcom/whoop/settings/DebugFragment$i$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/DebugFragment$i$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:[Lec3/l;


# direct methods
.method public constructor <init>([Lec3/l;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/settings/DebugFragment$i$c$a;->w:[Lec3/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Long;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$i$c$a;->w:[Lec3/l;

    array-length v0, v0

    new-array v0, v0, [Ljava/lang/Long;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/settings/DebugFragment$i$c$a;->a()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
