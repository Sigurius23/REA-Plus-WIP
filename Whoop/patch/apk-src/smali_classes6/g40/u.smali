.class public final synthetic Lg40/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lg40/r0;

.field public final synthetic F:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field public final synthetic G:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field public final synthetic H:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field public final synthetic I:Lg40/v2;

.field public final synthetic J:Ljava/util/Map;

.field public final synthetic K:Z

.field public final synthetic w:Lg40/v;

.field public final synthetic x:Ljava/util/Map;

.field public final synthetic y:Lg40/z;

.field public final synthetic z:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Lg40/v;Ljava/util/Map;Lg40/z;Ljava/util/Set;Lg40/r0;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lg40/v2;Ljava/util/Map;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/u;->w:Lg40/v;

    iput-object p2, p0, Lg40/u;->x:Ljava/util/Map;

    iput-object p3, p0, Lg40/u;->y:Lg40/z;

    iput-object p4, p0, Lg40/u;->z:Ljava/util/Set;

    iput-object p5, p0, Lg40/u;->E:Lg40/r0;

    iput-object p6, p0, Lg40/u;->F:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iput-object p7, p0, Lg40/u;->G:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iput-object p8, p0, Lg40/u;->H:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iput-object p9, p0, Lg40/u;->I:Lg40/v2;

    iput-object p10, p0, Lg40/u;->J:Ljava/util/Map;

    iput-boolean p11, p0, Lg40/u;->K:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lg40/u;->w:Lg40/v;

    iget-object v2, v0, Lg40/v;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Lg40/t;

    iget-object v3, p0, Lg40/u;->x:Ljava/util/Map;

    iget-object v4, p0, Lg40/u;->y:Lg40/z;

    iget-object v5, p0, Lg40/u;->z:Ljava/util/Set;

    iget-object v6, p0, Lg40/u;->E:Lg40/r0;

    iget-object v7, p0, Lg40/u;->F:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v8, p0, Lg40/u;->G:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v9, p0, Lg40/u;->H:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v10, p0, Lg40/u;->I:Lg40/v2;

    iget-object v11, p0, Lg40/u;->J:Ljava/util/Map;

    iget-boolean v12, p0, Lg40/u;->K:Z

    invoke-direct/range {v1 .. v12}, Lg40/t;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lg40/z;Ljava/util/Set;Lg40/r0;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lg40/v2;Ljava/util/Map;Z)V

    return-object v1
.end method
